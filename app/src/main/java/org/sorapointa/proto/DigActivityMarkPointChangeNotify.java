package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.DigMarkPoint.*;
import org.sorapointa.proto.DigMarkPoint;

public class DigActivityMarkPointChangeNotify {
    @Tag(tag=11) public List<DigMarkPoint> digMarkPointList = new ArrayList<>();
}
