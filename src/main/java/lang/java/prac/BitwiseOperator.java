public enum BitwiseOperator{

	BITWISE_NOT("~"), //OTHERWISE CALLED BIT INVERSION
	BITWISE_OR("|"),
	BITWISE_OR_ASSIGNMENT("|="),
	BITWISE_AND("&"),
	BITWISE_AND_ASSIGNMENT("&="),
	BITWISE_EXCLUSIVE_OR("^"),
	SHIFT_RIGHT(">>"),
	SHIFT_RIGHT_ZERO_FILL(">>>"),
	SHIFT_RIGHT_ASSIGNMENT(">>="),
	SHIFT_RIGHT_ZERO_FILL_ASSIGNMENT(">>>="),
	SHIFT_LEFT("<<"),
	SHIFT_LEFT_ASSIGNMENT("=<<");			     

	private final String key;	

	BitwiseOperator(final String k){
		this.key = k;
	}
	
	public String getKey(){
		return this.key;
	}

	public static BitwiseOperator keyDeterminer(final String k){

		for(BitwiseOperator bo : BitwiseOperator.values()){
			if( k.equals(bo.getKey()) )
				return bo;
		}
		return null;
	}

}
