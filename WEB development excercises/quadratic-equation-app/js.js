function getter()
{
    var a = document.getElementById("A").value;
    var b = document.getElementById("B").value;
    var c = document.getElementById("C").value;
    var D = discR(a, b, c);
   
    if (D < 0){
        document.getElementById("result1").innerHTML = "No real roots!";
        document.getElementById("result1").style.color = "red";
        document.getElementById("result2").innerHTML = '';
    }
   
    else{
        var sqrD = Math.sqrt(D);
        var x1 = Check(b, a, sqrD).toFixed(2);
        var x2 = Check(b, a, -sqrD).toFixed(2);
        document.getElementById("result2").innerHTML = "D: " + D + ", x1: " + x1 + ", x2:" + x2;
        document.getElementById("result2").style.color = "green";
        document.getElementById("result1").innerHTML = '';
    }
}
 
function discR(a, b, c){
   
    var D = b * b - 4 * a * c;
    return D;
}
 
 
 
function Check(b, a, sqrD){
    var x = -b + sqrD;
    var x = x / (2*a);
    return x;
}