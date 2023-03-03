package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.ChessNormalCardInfo.*;
import org.sorapointa.proto.ChessNormalCardInfo;

public class ChessPickCardNotify {
    @Tag(tag=13) public Integer curseCardId = null;
    @Tag(tag=1) public ChessNormalCardInfo normalCardInfo = null;
}
