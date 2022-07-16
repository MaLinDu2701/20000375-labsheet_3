object q3 extends  App{
  def sphere(r:Double):Double={
    return 4/3*Math.PI*r*r*r;
  }
  println("Volume: "+sphere(5));
}
