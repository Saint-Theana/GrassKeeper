package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.IslandPartySailStage.*;
import org.sorapointa.proto.IslandPartySailStage;

public class IslandPartySailInfoNotify {
    @Tag(tag=10) public Integer coin = null;
    @Tag(tag=8) public Integer stage = null;
    @Tag(tag=4) public Integer killMonsterCount = null;
    @Tag(tag=15) public Integer progress = null;
}
