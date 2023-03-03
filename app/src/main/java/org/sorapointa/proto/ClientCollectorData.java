package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class ClientCollectorData {
    @Tag(tag=10) public Integer materialId = null;
    @Tag(tag=8) public Integer maxPoints = null;
    @Tag(tag=13) public Integer currPoints = null;
}
