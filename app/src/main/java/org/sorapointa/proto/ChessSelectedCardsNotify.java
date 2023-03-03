package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.ChessCardInfo.*;
import org.sorapointa.proto.ChessCardInfo;

public class ChessSelectedCardsNotify {
    @Tag(tag=4) public List<ChessCardInfo> selectedCardInfoList = new ArrayList<>();
}
