package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.ChannelerSlabAssistInfo.*;
import org.sorapointa.proto.ChannelerSlabAssistInfo;

public class ChannelerSlabSaveAssistInfoRsp {
    @Tag(tag=8) public List<ChannelerSlabAssistInfo> assistInfoList = new ArrayList<>();
    @Tag(tag=11,isSigned=true) public Integer retcode = null;
}
