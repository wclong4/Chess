/**
 * this is the class for chess pieces
 * they must have a type and a color
 * @author Warren Long
 */
public class Piece {
	/**
	 * the color of the piece
	 */
	private char color;
	/**
	 * the type of the piece
	 * r for rook, q for queen, k for knight, i for king, p for pawn, b for bishop
	 */
	private char type;
	/**
	 * this is the constructor for the piece class
	 * it requires a type and a color
	 * @throws IllegalArgumentException if the color or type are invalid
	 * @param color w for white b for black
	 * @param type r for rook, q for queen, k for knight, i for king, p for pawn, b for bishop
	 */
	public Piece(char color, char type) {
		if (color != 'w' && color != 'b' ) {
			throw new IllegalArgumentException("Invalid color");
		}
		if (type != 'r' && type != 'q' && type != 'k' && type != 'i' && type != 'p' && type != 'b' ) {
			throw new IllegalArgumentException("Invalid type");
		}
		this.color = color;
		this.type = type;
	}
	/**
	 * @return the color
	 */
	public char getColor() {
		return color;
	}
	/**
	 * @return the type
	 */
	public char getType() {
		return type;
	}
	/**
	 * This sets the type, but only for pawns
	 * @throws IllegalArgumentException if you try to set a piece that is not a pawn
	 * @param type the type to set (you can only set the type with pawns)
	 */
	public void setType(char type) {
		this.type = type;
	}
	
	
}
