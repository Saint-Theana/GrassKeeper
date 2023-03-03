package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class SealBattleProgressNotify {
    @Tag(tag=9) public Integer sealEntityId = null;
    @Tag(tag=10) public Integer maxProgress = null;
    @Tag(tag=4) public Integer sealRadius = null;
    @Tag(tag=5) public Integer progress = null;
    @Tag(tag=2) public Integer endTime = null;
}
