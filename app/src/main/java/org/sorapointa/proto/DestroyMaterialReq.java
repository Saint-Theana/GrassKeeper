package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.MaterialInfo.*;
import org.sorapointa.proto.MaterialInfo;

public class DestroyMaterialReq {
    @Tag(tag=5) public List<MaterialInfo> materialList = new ArrayList<>();
}
