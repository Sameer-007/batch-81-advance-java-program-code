function addition() {
    var firstNo = document.getElementById("first").value
    var secondNo = document.getElementById("second").value

    alert("Welcome to Javascript program")
    alert(firstNo)
    alert(secondNo)
    alert("Datatype of First No " + typeof firstNo)
    alert("Datatype of Second " + typeof secondNo)
    alert('Addition of Two Numbers ' + (Number(firstNo) + Number(secondNo)))

    var output = Number(firstNo) + Number(secondNo)
    var p = document.getElementById("result");
    p.innerHTML = `Additon of Two Numbers ${output}` // ES6
}

// complete subtracton / multiplication / division