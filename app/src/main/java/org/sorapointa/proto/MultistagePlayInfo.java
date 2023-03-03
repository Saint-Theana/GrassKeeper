package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.CharAmusementInfo.*;
import org.sorapointa.proto.CharAmusementInfo;
import org.sorapointa.proto.HideAndSeekStageInfo.*;
import org.sorapointa.proto.HideAndSeekStageInfo;
import org.sorapointa.proto.InBattleChessInfo.*;
import org.sorapointa.proto.InBattleChessInfo;
import org.sorapointa.proto.InBattleFleurFairInfo.*;
import org.sorapointa.proto.InBattleFleurFairInfo;
import org.sorapointa.proto.InBattleIrodoriChessInfo.*;
import org.sorapointa.proto.InBattleIrodoriChessInfo;
import org.sorapointa.proto.InBattleMechanicusInfo.*;
import org.sorapointa.proto.InBattleMechanicusInfo;

public class MultistagePlayInfo {
    @Tag(tag=13) public Integer playIndex = null;
    @Tag(tag=11) public Integer playType = null;
    @Tag(tag=10) public Integer stageType = null;
    @Tag(tag=8) public Integer duration = null;
    @Tag(tag=12) public Integer groupId = null;
    @Tag(tag=9) public Integer beginTime = null;
    @Tag(tag=1) public Integer stageIndex = null;
    @Tag(tag=1334) public InBattleMechanicusInfo mechanicusInfo = null;
    @Tag(tag=1064) public InBattleFleurFairInfo fleurFairInfo = null;
    @Tag(tag=108) public HideAndSeekStageInfo hideAndSeekInfo = null;
    @Tag(tag=1758) public InBattleChessInfo chessInfo = null;
    @Tag(tag=531) public InBattleIrodoriChessInfo irodoriChessInfo = null;
    @Tag(tag=324) public CharAmusementInfo charAmusementInfo = null;
}
