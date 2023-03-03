package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class ChessNormalCardInfo {
    @Tag(tag=2) public Integer cardId = null;
    @Tag(tag=15) public Integer costPoints = null;
    @Tag(tag=6) public Boolean isAttachCurse = null;
}
