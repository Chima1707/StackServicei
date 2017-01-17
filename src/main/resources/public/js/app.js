(function() {
    'use strict';
    angular
        .module('App', [])
        .controller('MainController', function ($scope, Service) {
            $scope.pop = pop
            $scope.push = push


            function init () {
                    Service.show()
                        .then(function (data) {
                            $scope.numbers = data
                        })
            }

            function pop () {
                Service.pop()
                    .then(function () {
                        init ()
                    })
            }

            function push () {
                var val = prompt('Please add a number')
                if (isNaN(val) || !isFinite(val)) {
                    alert(val + ' is not a number')
                    return
                }
                val = parseInt(val, 10)

                Service.push(val)
                    .then(function (data) {
                        init()
                    })
            }

            init()
        })
        .factory('Service', function ($http, $q) {

            function pop() {
               return $http.post('/api/pop')
            }

            function show () {
                return $http.get('/api/')
                    .then(function (res) {
                        return res.data;
                    })
                    .catch(function () {
                        return []
                    })
            }

            function push (number) {
                return $http.post('/api/push', number)
            }
            return {
                pop: pop,
                push: push,
                show: show
            }
        })

})();
