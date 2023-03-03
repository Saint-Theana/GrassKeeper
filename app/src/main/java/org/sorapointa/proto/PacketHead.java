package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class PacketHead {
    public static class MapExtMap {
        @Tag(tag=1) public Integer key = null;
        @Tag(tag=2) public Integer value = null;
    }

    public static class MapServiceAppIdMap {
        @Tag(tag=1) public Integer key = null;
        @Tag(tag=2) public Integer value = null;
    }

    @Tag(tag=1) public Integer packetId = null;
    @Tag(tag=2) public Integer rpcId = null;
    @Tag(tag=3) public Integer clientSequenceId = null;
    @Tag(tag=4) public Integer enetChannelId = null;
    @Tag(tag=5) public Integer enetIsReliable = null;
    @Tag(tag=6) public Long sentMs = null;
    @Tag(tag=11) public Integer userId = null;
    @Tag(tag=12) public Integer userIp = null;
    @Tag(tag=13) public Integer userSessionId = null;
    @Tag(tag=21) public Long recvTimeMs = null;
    @Tag(tag=22) public Integer rpcBeginTimeMs = null;
    @Tag(tag=23) public List<MapExtMap> extMap = new ArrayList<>();
    @Tag(tag=24) public Integer senderAppId = null;
    @Tag(tag=31) public Integer sourceService = null;
    @Tag(tag=32) public Integer targetService = null;
    @Tag(tag=33) public List<MapServiceAppIdMap> serviceAppIdMap = new ArrayList<>();
    @Tag(tag=34) public Boolean isSetGameThread = null;
    @Tag(tag=35) public Integer gameThreadIndex = null;
}
