package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.FungusDetail.*;
import org.sorapointa.proto.FungusDetail;
import org.sorapointa.proto.FungusTrainingProgressDetail.*;
import org.sorapointa.proto.FungusTrainingProgressDetail;
import org.sorapointa.proto.FungusPlotStageDetail.*;
import org.sorapointa.proto.FungusPlotStageDetail;
import org.sorapointa.proto.FungusTrainingDungeonDetail.*;
import org.sorapointa.proto.FungusTrainingDungeonDetail;

public class FungusFighterInfo {
    @Tag(tag=3) public List<FungusDetail> fungusDetailList = new ArrayList<>();
    @Tag(tag=9) public List<Integer> unlockCampIdList = new ArrayList<>();
    @Tag(tag=4) public List<FungusTrainingProgressDetail> trainingDungeonProgressDetailList = new ArrayList<>();
    @Tag(tag=2) public List<Integer> finishCampIdList = new ArrayList<>();
    @Tag(tag=13) public List<Integer> unlockCultivateIdList = new ArrayList<>();
    @Tag(tag=6) public List<FungusPlotStageDetail> plotStageDetailList = new ArrayList<>();
    @Tag(tag=12) public List<FungusTrainingDungeonDetail> trainingDungeonDetailList = new ArrayList<>();
}
