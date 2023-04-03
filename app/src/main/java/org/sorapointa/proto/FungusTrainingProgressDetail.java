package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.FungusTrainingPoolPreviewDetail.*;
import org.sorapointa.proto.FungusTrainingPoolPreviewDetail;
import org.sorapointa.proto.FungusFighterMonsterDetail.*;
import org.sorapointa.proto.FungusFighterMonsterDetail;

public class FungusTrainingProgressDetail {
    @Tag(tag=15) public List<Integer> backupMonsterList = new ArrayList<>();
    @Tag(tag=1) public Integer curRound = null;
    @Tag(tag=8) public List<Integer> choosenMonsterList = new ArrayList<>();
    @Tag(tag=9) public List<FungusTrainingPoolPreviewDetail> monsterPoolPreviewList = new ArrayList<>();
    @Tag(tag=4) public Integer totalUsedTime = null;
    @Tag(tag=2) public List<FungusFighterMonsterDetail> monsterDetailList = new ArrayList<>();
    @Tag(tag=13) public Integer dungeonId = null;
}
