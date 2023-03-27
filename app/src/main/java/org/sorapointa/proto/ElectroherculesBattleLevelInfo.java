package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class ElectroherculesBattleLevelInfo {
    @Tag(tag=2) public Integer minFinishTime = null;
    @Tag(tag=12) public Integer levelId = null;
    @Tag(tag=13) public Boolean isFinish = null;
}
