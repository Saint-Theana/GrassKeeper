package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class FishPoolDataNotify {
    @Tag(tag=6) public Integer entityId = null;
    @Tag(tag=2) public Integer todayFishNum = null;
}
