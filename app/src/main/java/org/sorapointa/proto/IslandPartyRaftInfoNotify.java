package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class IslandPartyRaftInfoNotify {
    @Tag(tag=7) public Integer pointId = null;
    @Tag(tag=15) public Integer coin = null;
    @Tag(tag=3) public Integer fuel = null;
    @Tag(tag=13) public Integer component = null;
}
