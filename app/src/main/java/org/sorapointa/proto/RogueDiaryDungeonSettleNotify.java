package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class RogueDiaryDungeonSettleNotify {
    @Tag(tag=1) public Integer exploreTime = null;
    @Tag(tag=3) public Boolean isFinish = null;
    @Tag(tag=2) public Integer curRound = null;
}
