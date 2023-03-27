package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class Vector3Int {
    @Tag(tag=1,isSigned=true) public Integer X = null;
    @Tag(tag=2,isSigned=true) public Integer Y = null;
    @Tag(tag=3,isSigned=true) public Integer Z = null;
}
