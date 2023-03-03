package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.InBattleChessSettleInfo.*;
import org.sorapointa.proto.InBattleChessSettleInfo;
import org.sorapointa.proto.InBattleIrodoriChessSettleInfo.*;
import org.sorapointa.proto.InBattleIrodoriChessSettleInfo;
import org.sorapointa.proto.InBattleMechanicusSettleInfo.*;
import org.sorapointa.proto.InBattleMechanicusSettleInfo;

public class MultistagePlaySettleNotify {
    @Tag(tag=14) public Integer playIndex = null;
    @Tag(tag=4) public Integer groupId = null;
    @Tag(tag=1402) public InBattleMechanicusSettleInfo mechanicusSettleInfo = null;
    @Tag(tag=1283) public InBattleChessSettleInfo chessSettleInfo = null;
    @Tag(tag=612) public InBattleIrodoriChessSettleInfo irodoriChessSettleInfo = null;
}
