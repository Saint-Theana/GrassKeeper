package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.ChannellerSlabBuffSchemeInfo.*;
import org.sorapointa.proto.ChannellerSlabBuffSchemeInfo;
import org.sorapointa.proto.ChannellerSlabAssistInfo.*;
import org.sorapointa.proto.ChannellerSlabAssistInfo;

public class ChannellerSlabBuffInfo {
    @Tag(tag=6) public ChannellerSlabBuffSchemeInfo singleBuffSchemeInfo = null;
    @Tag(tag=10) public List<Integer> buffIdList = new ArrayList<>();
    @Tag(tag=9) public ChannellerSlabBuffSchemeInfo mpBuffSchemeInfo = null;
    @Tag(tag=14) public List<ChannellerSlabAssistInfo> assistInfoList = new ArrayList<>();
}
