package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.Vector.*;
import org.sorapointa.proto.Vector;

public class DigMarkPoint {
    @Tag(tag=1) public Vector pos = null;
    @Tag(tag=13) public Integer bundleId = null;
    @Tag(tag=3) public Vector rot = null;
}
