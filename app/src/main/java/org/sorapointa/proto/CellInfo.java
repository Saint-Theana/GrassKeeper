package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class CellInfo {
    @Tag(tag=1) public Integer type = null;
    @Tag(tag=2,isSigned=true) public Integer Y = null;
}
