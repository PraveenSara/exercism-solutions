"""Functions which helps the locomotive engineer to keep track of the train."""


def get_list_of_wagons(*wagon_list):
    """Return a list of wagons.

    :param: arbitrary number of wagons.
    :return: list - list of wagons.
    """
    return list(wagon_list)


def fix_list_of_wagons(each_wagons_id, missing_wagons):
    """Fix the list of wagons.

    :param each_wagons_id: list - the list of wagons.
    :param missing_wagons: list - the list of missing wagons.
    :return: list - list of wagons.
    """
    
    each_wagons_id.remove(1)
    w1, w2, *w_rest = each_wagons_id
    *wagon_list, = 1, *missing_wagons, *w_rest, w1, w2

    return wagon_list

def add_missing_stops(route, **stops):
    """Add missing stops to route dict.

    :param route: dict - the dict of routing information.
    :param: arbitrary number of stops.
    :return: dict - updated route dictionary.
    """
    *stop, = stops.values()
    next = dict(stops=stop)
    return route | next


def extend_route_information(route, more_route_information):
    """Extend route information with more_route_information.

    :param route: dict - the route information.
    :param more_route_information: dict -  extra route information.
    :return: dict - extended route information.
    """
    return {**route, **more_route_information}


def fix_wagon_depot(wagons_rows):
    """Fix the list of rows of wagons.

    :param wagons_rows: list[list[tuple]] - the list of rows of wagons.
    :return: list[list[tuple]] - list of rows of wagons.
    """
    *wagons, = zip(*wagons_rows)

    new_row = []
    
    for data in wagons:
        new_row.append(list(data))
    return new_row
