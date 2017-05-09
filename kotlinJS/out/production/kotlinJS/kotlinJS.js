if (typeof kotlin === 'undefined') {
  throw new Error("Error loading module 'kotlinJS'. Its dependency 'kotlin' was not found. Please, check whether 'kotlin' is loaded prior to 'kotlinJS'.");
}
var kotlinJS = function (_, Kotlin) {
  'use strict';
  var println = Kotlin.kotlin.io.println_s8jyv4$;
  function main(args) {
    var tmp$, tmp$_0;
    var h1 = document.createElement('h1');
    h1.textContent = 'FizzBuzz Kotlin JS';
    ((tmp$ = document.body) != null ? tmp$ : Kotlin.throwNPE()).appendChild(h1);
    var h2 = document.createElement('h2');
    h2.textContent = invoke3(100);
    ((tmp$_0 = document.body) != null ? tmp$_0 : Kotlin.throwNPE()).appendChild(h2);
    println('Hello World!');
  }
  function invoke3(i) {
    var tmp$;
    if (i === 0)
      return '';
    if (i % 15 === 0)
      tmp$ = 'FizzBuzz ';
    else if (i % 3 === 0)
      tmp$ = 'Fizz ';
    else if (i % 5 === 0)
      tmp$ = 'Buzz ';
    else
      tmp$ = i.toString() + ' ';
    var str = tmp$;
    return invoke3(i - 1 | 0) + Kotlin.toString(str);
  }
  _.main_kand9s$ = main;
  _.invoke3_za3lpa$ = invoke3;
  Kotlin.defineModule('kotlinJS', _);
  main([]);
  return _;
}(typeof kotlinJS === 'undefined' ? {} : kotlinJS, kotlin);
