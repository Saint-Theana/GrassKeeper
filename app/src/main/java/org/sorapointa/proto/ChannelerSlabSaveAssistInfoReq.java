package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.ChannelerSlabAssistInfo.*;
import org.sorapointa.proto.ChannelerSlabAssistInfo;

public class ChannelerSlabSaveAssistInfoReq {
    @Tag(tag=8) public List<ChannelerSlabAssistInfo> assistInfoList = new ArrayList<>();
}
