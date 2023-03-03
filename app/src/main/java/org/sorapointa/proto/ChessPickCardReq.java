package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class ChessPickCardReq {
    @Tag(tag=1) public Integer cardId = null;
    @Tag(tag=4) public Integer cardIndex = null;
}
