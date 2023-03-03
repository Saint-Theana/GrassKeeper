package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.FurnitureMakeInfo.*;
import org.sorapointa.proto.FurnitureMakeInfo;

public class FunitureMakeInfoChangeNotify {
    @Tag(tag=1) public FurnitureMakeInfo makeInfo = null;
}
