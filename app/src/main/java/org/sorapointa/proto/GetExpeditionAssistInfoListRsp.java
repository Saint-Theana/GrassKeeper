package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.ExpeditionAssistInfo.*;
import org.sorapointa.proto.ExpeditionAssistInfo;

public class GetExpeditionAssistInfoListRsp {
    @Tag(tag=6) public List<ExpeditionAssistInfo> assistInfoList = new ArrayList<>();
    @Tag(tag=7,isSigned=true) public Integer retcode = null;
}
