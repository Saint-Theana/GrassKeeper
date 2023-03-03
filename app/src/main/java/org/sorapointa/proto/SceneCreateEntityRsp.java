package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.CreateEntityInfo.*;
import org.sorapointa.proto.CreateEntityInfo;

public class SceneCreateEntityRsp {
    @Tag(tag=14,isSigned=true) public Integer retcode = null;
    @Tag(tag=1) public Integer entityId = null;
    @Tag(tag=10) public CreateEntityInfo entity = null;
}
