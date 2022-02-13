

echo "Main: " + args.toString()
if (args["env"] == "py") {
  def a = 2
  echo "hiu"
  if (a = 2) {
    echo "hihi"
    else if (a = 3) {
      echo "a=3"
    }
  }
}
else if (args["env"] == "pipi") {
  def y = 2
  echo "y"
  if (y = 2) {
    echo "y = 2"
    else if (y = 3) {
      echo "y = 3"
    }
  }
}
