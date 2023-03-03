package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.CreateEntityInfo.*;
import org.sorapointa.proto.CreateEntityInfo;
import org.sorapointa.proto.CreateReason.*;
import org.sorapointa.proto.CreateReason;

public class SceneCreateEntityReq {
    @Tag(tag=1) public CreateEntityInfo entity = null;
    @Tag(tag=10) public Boolean isDestroyWhenDisconnect = null;
    @Tag(tag=3) public Integer reason = null;
}
