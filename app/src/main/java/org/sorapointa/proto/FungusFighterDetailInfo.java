package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.FungusDetail.*;
import org.sorapointa.proto.FungusDetail;
import org.sorapointa.proto.FungusPlotStageDetail.*;
import org.sorapointa.proto.FungusPlotStageDetail;
import org.sorapointa.proto.FungusTrainingDungeonDetail.*;
import org.sorapointa.proto.FungusTrainingDungeonDetail;
import org.sorapointa.proto.FungusTrainingProgressDetail.*;
import org.sorapointa.proto.FungusTrainingProgressDetail;

public class FungusFighterDetailInfo {
    @Tag(tag=6) public List<FungusPlotStageDetail> plotStageDetailList = new ArrayList<>();
    @Tag(tag=4) public List<FungusDetail> fungusDetailList = new ArrayList<>();
    @Tag(tag=12) public List<Integer> unlockCampIdList = new ArrayList<>();
    @Tag(tag=3) public List<FungusTrainingProgressDetail> trainingDungeonProgressDetailList = new ArrayList<>();
    @Tag(tag=15) public List<FungusTrainingDungeonDetail> trainingDungeonDetailList = new ArrayList<>();
    @Tag(tag=1) public List<Integer> finishCampIdList = new ArrayList<>();
    @Tag(tag=8) public List<Integer> unlockCultivateIdList = new ArrayList<>();
}
