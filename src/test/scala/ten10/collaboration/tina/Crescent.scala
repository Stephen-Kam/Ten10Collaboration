package ten10.collaboration.tina

import ten10.collaboration.utils.BaseFeatureSpec


class MyFlatmates extends BaseFeatureSpec{
  Given ("I just finised from Academy 7 and moved to Worthing")
  And ("I am living with my two wonderful colleagues- three Kennies and Louis")
  And ("Each have their own habits")
  When ("Kenny is bored")
  def kenny:Unit = {
  System.out.println("Kenny loves to make funny sound)
  }
  When ("I always meet Louis in the early morning")
  def louis:Unit ={
  System.out.println("Louis like me to call him -gg ")
  }
}

