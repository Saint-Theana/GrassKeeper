package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class DigMarkPoint {
    @Tag(tag=14) public Vector rot = null;
    @Tag(tag=2) public Vector pos = null;
    @Tag(tag=3) public Integer bundleId = null;
}
