angular.module('TIYAngularApp', [])
   .controller('SampleController', function($scope, $http) {


        $scope.chocolate = function() { // Is an anonymous function
            console.log("About to go get me some data!");
            $http.post("/sweet.json", $scope.cocoInput)
                .then(
                    function successCallback(response) {
                        console.log(response.data);

                       $scope.cocoSolution = response.data; //games is  equal to the data you got back frm the

                    },
                    function errorCallback(response) {
                        console.log("Unable to get data");
                  });
        };

         $scope.makeArray = function(arraySize) {
                    var returnArray = [];
                    for (var i = 0; i < arraySize; i++) {
                        returnArray.push(i);
                    }
                    return returnArray;
                }

   });