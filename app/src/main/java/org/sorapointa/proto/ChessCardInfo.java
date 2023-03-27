package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class ChessCardInfo {
    @Tag(tag=11) public Integer cardId = null;
    @Tag(tag=12) public Integer effectStack = null;
}
