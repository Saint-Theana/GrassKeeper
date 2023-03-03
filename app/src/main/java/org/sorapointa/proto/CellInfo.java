package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.SceneSurfaceMaterial.*;
import org.sorapointa.proto.SceneSurfaceMaterial;

public class CellInfo {
    @Tag(tag=1) public Integer type = null;
    @Tag(tag=2,isSigned=true) public Integer y = null;
}
