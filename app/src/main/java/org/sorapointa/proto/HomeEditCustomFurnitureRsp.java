package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.HomeCustomFurnitureInfo.*;
import org.sorapointa.proto.HomeCustomFurnitureInfo;

public class HomeEditCustomFurnitureRsp {
    @Tag(tag=11) public HomeCustomFurnitureInfo customFurnitureInfo = null;
    @Tag(tag=14,isSigned=true) public Integer retcode = null;
}
