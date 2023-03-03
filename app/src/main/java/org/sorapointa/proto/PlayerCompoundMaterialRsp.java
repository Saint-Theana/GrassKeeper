package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.CompoundQueueData.*;
import org.sorapointa.proto.CompoundQueueData;

public class PlayerCompoundMaterialRsp {
    @Tag(tag=5) public CompoundQueueData compoundQueueData = null;
    @Tag(tag=12,isSigned=true) public Integer retcode = null;
}
