package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class IslandPartyRaftInfo {
    @Tag(tag=10) public Integer coin = null;
    @Tag(tag=5) public Integer raftEntityId = null;
    @Tag(tag=13) public Integer pointId = null;
    @Tag(tag=4) public Integer fuel = null;
    @Tag(tag=7) public Integer component = null;
    @Tag(tag=15) public Integer startSource = null;
}
