package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.ForgeQueueManipulateType.*;
import org.sorapointa.proto.ForgeQueueManipulateType;

public class ForgeQueueManipulateReq {
    @Tag(tag=5) public Integer forgeQueueId = null;
    @Tag(tag=13) public Integer manipulateType = null;
}
