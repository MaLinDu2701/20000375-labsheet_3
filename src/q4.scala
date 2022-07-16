object q4 extends App{
  def price(t:Int):Double={
    var dis:Double=t*24.95*0.6;
    var rest:Int=t-50;
    if(rest>0){
      return 50*3+0.75*rest+dis
    }
    else{
      return t*30+dis;
    }
  }
  println("$"+price(60))
}
