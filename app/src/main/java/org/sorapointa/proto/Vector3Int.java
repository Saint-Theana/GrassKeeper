package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class Vector3Int {
    @Tag(tag=1,isSigned=true) public Integer x = null;
    @Tag(tag=2,isSigned=true) public Integer y = null;
    @Tag(tag=3,isSigned=true) public Integer z = null;
}
