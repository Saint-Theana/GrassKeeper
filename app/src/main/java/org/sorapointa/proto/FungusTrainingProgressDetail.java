package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.FungusFighterMonsterDetail.*;
import org.sorapointa.proto.FungusFighterMonsterDetail;
import org.sorapointa.proto.FungusTrainingPoolPreviewDetail.*;
import org.sorapointa.proto.FungusTrainingPoolPreviewDetail;

public class FungusTrainingProgressDetail {
    @Tag(tag=9) public Integer curRound = null;
    @Tag(tag=10) public Integer dungeonId = null;
    @Tag(tag=5) public List<FungusTrainingPoolPreviewDetail> monsterPoolPreviewList = new ArrayList<>();
    @Tag(tag=6) public List<FungusFighterMonsterDetail> monsterDetailList = new ArrayList<>();
    @Tag(tag=7) public Integer totalUsedTime = null;
    @Tag(tag=4) public List<Integer> backupMonsterList = new ArrayList<>();
    @Tag(tag=8) public List<Integer> choosenMonsterList = new ArrayList<>();
}
