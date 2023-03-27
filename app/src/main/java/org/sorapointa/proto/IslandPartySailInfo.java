package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class IslandPartySailInfo {
    @Tag(tag=1) public Integer startSource = null;
    @Tag(tag=5) public Integer killProgress = null;
    @Tag(tag=11) public Integer maxCleanProgress = null;
    @Tag(tag=14) public Integer stage = null;
    @Tag(tag=7) public Integer maxKillProgress = null;
    @Tag(tag=13) public Integer coin = null;
    @Tag(tag=8) public Integer cleanProgress = null;
}
