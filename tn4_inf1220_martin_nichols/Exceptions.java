package tn4_inf1220_martin_nichols;


class InvalidTokenFormatException extends RuntimeException {
InvalidTokenFormatException(String msg) { super(msg); }
}


class InvalidIndexException extends RuntimeException {
InvalidIndexException(String msg) { super(msg); }
}


class InvalidValueException extends RuntimeException {
InvalidValueException(String msg) { super(msg); }
}


class DuplicateCellConflictException extends RuntimeException {
DuplicateCellConflictException(String msg) { super(msg); }
}


class IncompleteGridException extends RuntimeException {
IncompleteGridException(String msg) { super(msg); }
}


class InvalidSudokuException extends RuntimeException {
InvalidSudokuException(String msg) { super(msg); }
}