package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class ChessPickCardRsp {
    @Tag(tag=11) public Integer cardIndex = null;
    @Tag(tag=1) public Integer cardId = null;
    @Tag(tag=4,isSigned=true) public Integer retcode = null;
}
