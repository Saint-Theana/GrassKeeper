package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.ChannelerSlabAssistInfo.*;
import org.sorapointa.proto.ChannelerSlabAssistInfo;
import org.sorapointa.proto.ChannelerSlabBuffSchemeInfo.*;
import org.sorapointa.proto.ChannelerSlabBuffSchemeInfo;

public class ChannelerSlabBuffInfo {
    @Tag(tag=6) public ChannelerSlabBuffSchemeInfo mpBuffSchemeInfo = null;
    @Tag(tag=8) public List<Integer> buffIdList = new ArrayList<>();
    @Tag(tag=7) public ChannelerSlabBuffSchemeInfo singleBuffSchemeInfo = null;
    @Tag(tag=15) public List<ChannelerSlabAssistInfo> assistInfoList = new ArrayList<>();
}
